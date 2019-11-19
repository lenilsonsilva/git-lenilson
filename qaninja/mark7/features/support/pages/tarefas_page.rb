# frozen_string_literal: true

class TarefasPage
  include Capybara::DSL

  def ola
    find('#task-board h3')
  end

  # element :ola, '#task-board h3'
end
