package dto;

import java.time.LocalDate;

public class ToDoDto {

    private String toDo;
    private LocalDate startDay;
    private LocalDate finishDay;
    private boolean done;
    private String review;

    public ToDoDto(String toDo, LocalDate startDay, LocalDate finishDay, boolean done, String review) {
        this.toDo = toDo;
        this.startDay = startDay;
        this.finishDay = finishDay;
        this.done = done;
        this.review = review;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    public LocalDate getStartDay() {
        return startDay;
    }

    public void setStartDay(LocalDate startDay) {
        this.startDay = startDay;
    }

    public LocalDate getFinishDay() {
        return finishDay;
    }

    public void setFinishDay(LocalDate finshiDay) {
        this.finishDay = finshiDay;
    }

    public boolean getdone() {
        return done;
    }

    public void setdone(Boolean done) {
        this.done = done;
    }

    public String getDoneStatus() {
        if (done) {
            return "완료";
        } else {
            return "아직";
        }
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}

