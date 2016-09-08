Calories Managment
===============================

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/fd10a882fc3048a2bbdc5c347fa4fac3)](https://www.codacy.com/app/egor-a-petrov/topjava/)
### <a href="http://topjava.herokuapp.com/" target=_blank>Демо разрабатываемого приложения</a>
#### Технологии
Spring Security, Spring MVC, Spring Data JPA, Spring Security Test, Hibernate ORM, JDBC, Hibernate Validator, SLF4J, Json Jackson, JSP, JSTL, Apache Tomcat, WebJars, DataTables plugin, Ehcache, PostgreSQL, JUnit, Hamcrest, jQuery, jQuery notification, Bootstrap.

####Описание проекта
Java Enterprise проект с регистрацией/авторизацией и интерфейсом на основе ролей (USER, ADMIN).
Администратор может создавать/редактировать/удалять/пользователей, а пользователь - управлять своим профилем и данными (день, еда, калории) через UI (по AJAX) и по REST интерфейсу с базовой авторизацией.
Возможна фильтрация данных по датам и времени, при этом цвет записи таблицы еды зависит от того, превышает ли сумма калорий за день норму (редактируемый параметр в профиле пользователя).
Весь REST интерфейс покрывается JUnit тестами, используя Spring MVC Test и Spring Security Test.

#### <a href="description.md">План проекта >>
#### <a href="http://javaops.ru/">Сайт стажировки JavaOPs>>



