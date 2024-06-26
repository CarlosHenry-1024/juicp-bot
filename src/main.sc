theme: /
    
    state: Start
        q!: *start
        q!: * (привет/здравствуй*/~добрый (~утро/~вечер/~день/~ночь)) *
        random:
            a: Добрый день! Я помогу вам купить билет в кино.
            a: Здравствуйте! Я могу помочь вам с билетом.
            a: Приветствую! Я могу помочь вам с билетом в кино.
            
    state: Weather
        q!: * ~погода *
        a: Сегодня в Петербурге дождь.
    
    state: Currency
        q!: * ~валют * 
        a: Обменный курс рубля к доллару США составляет 1:0.01123.
            
    state: CatchAll
        event!: noMatch
        random:
            a: Простите, я вас не понял.
            a: Извините, я вас не понимаю.
        random:
            a: Попробуйте сказать по-другому.
            a: Переформулируйте, пожалуйста.