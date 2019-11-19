# frozen_string_literal: true

class PerfilPage
  include Capybara::DSL

  def completa(empresa, _cargp)
    find('input[name$=company]').set empresa
    combo_cargo = find('select[name$=job]')
    combo_cargo.find('option', text: cargo).select_option
    click_button 'Salvar'
    sleep 5
  end

  def alert
    find('.panel-c-success')
  end
end
