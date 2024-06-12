theme: /
    
    state: Start
        q!: *start
        q!: * (привет/здравствуй*/~добрый (~утро/~вечер/~день/~ночь)) *
        random:
            a: Добрый день! Я помогу вам купить билет в кино.
            a: Здравствуйте! Я могу помочь вам с билетом.
            a: Приветствую! Я могу помочь вам с билетом в кино.
            
    state: CatchAll
        event!: noMatch
        random:
            a: Простите, я вас не понял.
            a: Извините, я вас не понимаю.
        random:
            a: Попробуйте сказать по-другому.
            a: Переформулируйте, пожалуйста.
            
    state: Match
    event!: match
    a: {{$context.intent.answer}}
    
    state: WeatherQuery
    intent!: /погода
    a: В каком городе вы хотите узнать погоду?

    slot_filling:
        slots:
            city:
                prompt: Пожалуйста, назовите город.
                type: string

    script:
        - $city = $context.slots.city
        - if ($city) {
            a: Погода в {{$city}} будет уточнена.
          } else {
            a: Извините, я не смог распознать город.
          }
          
    state: CurrencyQuery
    intent!: /курс
    a: Какую валютную пару вы хотите узнать?

    slot_filling:
        slots:
            currency_pair:
                prompt: Пожалуйста, назовите валютную пару (например, USD/EUR).
                type: string

    script:
        - $currency_pair = $context.slots.currency_pair
        - if ($currency_pair) {
            a: Курс валюты для {{$currency_pair}} будет уточнен.
          } else {
            a: Извините, я не смог распознать валютную пару.
          }
