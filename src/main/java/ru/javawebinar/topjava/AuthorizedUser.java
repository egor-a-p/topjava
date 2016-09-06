package ru.javawebinar.topjava;

import ru.javawebinar.topjava.util.UserMealsUtil;

import ru.javawebinar.topjava.model.BaseEntity;

public class AuthorizedUser {
    public static int id = BaseEntity.START_SEQ;

    public static int id() {
        return id;
    }

    public static void setId(int id) {
        AuthorizedUser.id = id;
    }

    public static int getCaloriesPerDay() {
        return UserMealsUtil.DEFAULT_CALORIES_PER_DAY;
    }
}
