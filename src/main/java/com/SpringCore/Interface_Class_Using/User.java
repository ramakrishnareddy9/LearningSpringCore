package com.SpringCore.Interface_Class_Using;

public class User implements Cloud{

    public User() {
        System.out.println("User is running");
    }
    @Override
    public void usingDatabase() {
        System.out.println("Using Database by user");
    }

    @Override
    public void updatingDatabase() {
        System.out.println("updating Database by user");
    }

    @Override
    public void deletingDatabase() {
        System.out.println("deleting Database by user");
    }
}
