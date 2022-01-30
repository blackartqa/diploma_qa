## Отчёт по итогам тестирования  
В соответствии с утверждённым [планом](https://github.com/blackartqa/diploma_qa/blob/master/documentation/plan.md) проведено тестирование веб-сервиса по покупке туров, сценарии тестирования автоматизированы.
### Автоматизация
Было реализовано 30 автотестов, с помощью которых быи покрыты все [тест-кейсы](https://github.com/blackartqa/diploma_qa/blob/master/documentation/testrun.md). Из них 20 passed, 10 failed (66.6% успешных).  
### Отчёты Allure и Gradle
![Allure](https://github.com/blackartqa/diploma_qa/blob/master/documentation/report/Screenshot_1.png)  
![Gradle](https://github.com/blackartqa/diploma_qa/blob/master/documentation/report/Screenshot_2.png)  
### По результатам выполнения заведены Issues
1. [Опечатка в названии города](https://github.com/blackartqa/diploma_qa/issues/1)
2. [Неверный заголовок вкладки](https://github.com/blackartqa/diploma_qa/issues/2)
3. [При покупке тура через declined карту появляется сообщение "Операция успешно одобрена банком"](https://github.com/blackartqa/diploma_qa/issues/3)
4. [При вводе некорректного месяца нет сообщения об ошибке](https://github.com/blackartqa/diploma_qa/issues/4)
5. [При вводе невалидных данных в поле "Владелец" нет сообщения об ошибке](https://github.com/blackartqa/diploma_qa/issues/5)
6. [При вводе некорректного CVC нет сообщения об ошибке](https://github.com/blackartqa/diploma_qa/issues/6)
7. [При вводе кириллицы в поле "Владелец" нет сообщения об ошибке](https://github.com/blackartqa/diploma_qa/issues/7)
### Сработавшие риски  
1. Трудности с настройкой двух БД.
2. Отсутствие документации по работе приложения: пришлось самостоятельно разбираться с принципами работы и предполагать ожидаемые сценарии работы.
3. Проблемы с совместимостью Allure с gradle версий выше 7. [Решение](https://github.com/allure-framework/allure-gradle/issues/60)

### Сроки выполнения  
Запланированный срок выполнения работы приблизительно соответствует реальному и составляет около 60 часов.