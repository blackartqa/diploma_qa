## Отчёт по итогам тестирования  
В соответствии с утверждённым [планом](https://github.com/blackartqa/diploma_qa/blob/master/documentation/plan.md) проведено тестирование веб-сервиса по покупке туров, сценарии тестирования автоматизированы.
### Автоматизация
Было реализовано 26 автотестов, с помощью которых быи покрыты все [тест-кейсы](https://github.com/blackartqa/diploma_qa/blob/master/documentation/testrun.md). Из них 20 passed, 6 failed (76% успешных).  
### Отчёты Allure и Gradle
![Allure](https://github.com/blackartqa/diploma_qa/blob/master/documentation/report/Screenshot_1.png)  
![Gradle](https://github.com/blackartqa/diploma_qa/blob/master/documentation/report/Screenshot_2.png)  
### По результатам выполнения заведены Issues

### Сработавшие риски  
1. Трудности с настройкой двух БД.
2. Отсутствие документации по работе приложения: пришлось самостоятельно разбираться с принципами работы и предполагать ожидаемые сценарии работы.
3. Проблемы с совместимостью Allure с gradle версий выше 7. [Решение](https://github.com/allure-framework/allure-gradle/issues/60)

### Сроки выполнения  
Запланированный срок выполнения работы приблизительно соответствует реальному и составляет около 60 часов.