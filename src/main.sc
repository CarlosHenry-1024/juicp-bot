require: slotfilling/slotFilling.sc
module = sys.zb-common
theme: /
    state: Start
        q! :*start
        q!:* (привет/здравствуй*/~добрый (~утро/~вечер/~день/~ночь)) *
        random:
            а: Добрый день! Я помогу вам купить билет в кино.
            а: Здравствуйте! Я могу помочь вам с билетом.
            а: Приветствую! Я могу помочь вам с билетом в кино.|