package hello.core.member;

public class Member { //Member의 속성 3가지
    private Long id;
    private String name;
    private Grade grade;

    public Member(Long id, String name, Grade grade) { //생성자
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() { //Getter
        return id;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setId(Long id) { //Setter
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }


}
