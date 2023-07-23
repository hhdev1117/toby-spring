package org.example.domain;

public class User {
    String id;
    String name;
    String password;

    public User() {
        valLengthCheckUser(this.id, this.name, this.password);

    }

    public User(String id, String name, String password) {
        valLengthCheckUser(id, name, password);
        valNullCheckUser(id, name, password);

        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    private void valLengthCheckUser(String id, String name, String password) {
        if(id.length() > 10) throw new IllegalArgumentException("id는 10자리 이내로 입력해주세요.");
        if(name.length() > 5) throw new IllegalArgumentException("이름은 5자리 이내로 입력해주세요.");
        if(password.length() > 10) throw new IllegalArgumentException("password는 10자리 이내로 입력해주세요.");
    }

    private void valNullCheckUser(String id, String name, String password) {
        if(id.isEmpty() || id == null) throw new IllegalArgumentException("id를 입력해주세요");
        if(name.isEmpty() || name == null) throw new IllegalArgumentException("이름을 입력해주세요");
        if(password.isEmpty() || password == null) throw new IllegalArgumentException("password를 입력해주세요");
    }
}