package org.jspider.RestApiArchitecture_Demo3_database.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {
    private int id;
    private String name;
    private String stream;
    private  double percentage;
    private String course;
}
