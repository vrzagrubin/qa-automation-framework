# qa-automation-framework

Учебный тест-фреймворк QA Automation (Java) — портфолио-проект курса «Manual QA → QA Automation Engineer».

## Стек (целевой)

- Java 17 (Temurin)
- Maven
- JUnit 5, Mockito
- REST Assured (API)
- Selenium 4 (UI, Page Object Model)
- Allure (отчёты)
- GitHub Actions (CI)

## Стенды (бесплатные)

- UI-механики: https://the-internet.herokuapp.com
- UI-бизнес-флоу: https://www.saucedemo.com
- API: https://jsonplaceholder.typicode.com, https://reqres.in

## Как запускать

```bash
mvn test
```

## Структура (целевая)

```
src/test/java/
├── api/        # clients, models (POJO), tests
├── ui/         # pages, components, tests
├── core/       # DriverFactory, ConfigReader, TestListener
└── utils/      # TestDataGenerator, SQLHelper
```

Сейчас на старте: `core/SmokeTest.java` — проверка стенда.
