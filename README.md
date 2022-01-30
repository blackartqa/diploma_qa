# Дипломный проект профессии «Тестировщик»

Дипломный проект представляет собой автоматизацию тестирования комплексного сервиса, взаимодействующего с СУБД и API Банка.  
* [План автоматизации](https://github.com/blackartqa/diploma_qa/blob/master/documentation/plan.md)  
* [Тест-кейсы](https://github.com/blackartqa/diploma_qa/blob/master/documentation/testrun.md)  
* [Отчёт о тестировании](https://github.com/blackartqa/diploma_qa/blob/master/documentation/Testing%20Report.md)  
* [Найденные ошибки](https://github.com/blackartqa/diploma_qa/issues)
### Запуск тестов  
_Инициализация_  
Запустить контейнеры командой `docker-compose up -d`  
#### Тесты с БД MySQL  
1. Запустить SUT, выполнив в терминале команду `java -jar ./artifacts/aqa-shop.jar --spring.datasource.url=jdbc:mysql://localhost:3306/app -P:jdbc.user=user -P:jdbc.password=pass`  
2. Чтобы запустить автотесты, нужно вызвать командную строку двойным нажатием Ctrl и выполнить там команду `gradlew clean test -Ddb.url=jdbc:mysql://localhost:3306/app`
  

#### Тесты с БД PostgreSQL
1. Запустить SUT, выполнив в терминале команду `java -jar ./artifacts/aqa-shop.jar --spring.datasource.url=jdbc:postgresql://localhost:5432/appps -P:jdbc.user=userps -P:jdbc.password=passps`
2. Чтобы запустить автотесты, нужно вызвать командную строку двойным нажатием Ctrl и выполнить там команду `gradlew clean test -Ddb.url=jdbc:postgresql://localhost:5432/appps`

### Создание отчётов о тестировании  
Для создания отчёта о тестировании, нужно вызвать командную строку двойным нажатием Ctrl и выполнить там команды `gradlew allureReport` и `gradlew allureServe`
