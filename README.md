### Запуск тестов  
_Инициализация_  
Запустить контейнеры командой `docker-compose up -d`  
#### Тесты с БД MySQL  
1. Запустить SUT, выполнив в терминале команду `java -jar ./artifacts/aqa-shop.jar --spring.datasource.url=jdbc:mysql://localhost:3306/app -P:jdbc.user=app -P:jdbc.password=pass`  
2. Чтобы запустить автотесты, нужно вызвать командную строку двойным нажатием Ctrl и выполнить там команду `gradlew clean test -Ddb.url=jdbc:mysql://localhost:3306/app`
  

#### Тесты с БД PostgreSQL
1. Запустить SUT, выполнив в терминале команду ` java -jar ./artifacts/aqa-shop.jar --spring.datasource.url=jdbc:postgresql://localhost:5432/app -P:jdbc.user=app -P:jdbc.password=pass`
2. Чтобы запустить автотесты, нужно вызвать командную строку двойным нажатием Ctrl и выполнить там команду `gradlew clean test -Ddb.url=jdbc:postgresql://localhost:5432/app`

### Создание отчётов о тестировании  
Для создания отчёта о тестировании, нужно вызвать командную строку двойным нажатием Ctrl и выполнить там команды `gradlew allureReport` и `gradlew allureServe`
