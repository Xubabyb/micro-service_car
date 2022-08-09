package my.home.service_car.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Car {
    private long id;
    private String model;
    private String serial;
}
