#language: ru
Функция: Страница Text Input

  Сценарий: Проверка изменения текста кнопки
    Дано Загружаем страницу "TextInputPage"
    Тогда Проверим, что в поле "Name" содержится значение ""
    И Проверим, что подпись "Button" содержит значение "Button That Should Change it's Name Based on Input Value"

    Когда Нажмём на кнопку "Button"
    Тогда Проверим, что подпись "Button" содержит значение "Button That Should Change it's Name Based on Input Value"

    Когда Введём в поле "Name" значение "New"
    Тогда Проверим, что в поле "Name" содержится значение "New"
    И Проверим, что подпись "Button" содержит значение "Button That Should Change it's Name Based on Input Value"

    Когда Нажмём на кнопку "Button"
    Тогда Проверим, что подпись "Button" содержит значение "New"

    Когда Введём в поле "Name" значение ""
    И Нажмём на кнопку "Button"
    Тогда Проверим, что подпись "Button" содержит значение "New"