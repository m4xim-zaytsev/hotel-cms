## инсутркция:
1. **перейти cd .\docker**
2. **запустить docker-star.cmd**
3. **run application**
4. **документация по http://localhost:8080/swagger-ui/index.html**


# О проекте
разработать backend-составляющую системы бронирования отелей с возможностью управления контентом через административную панель CMS. 
Задача максимально приближена к реальной.
Главная задача — обеспечить пользователям возможность забронировать понравившийся отель на определённый период.
Помимо этого, нужно сделать поиск отелей по критериям и рейтингам и систему выставления оценок в приложении (от 1 до 5).
Сервис должен позволять администраторам выгружать статистику по работе в формате CSV-файла.

## стек
1. java 17
2. springboot version "3.3.0"
3. spring security
3. kafka
4. liquibase
5. db:
    - postgres
    - mongodb
6. развертка - docker 
7. для тестов - junit