package kr.co.abacus.javamain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder(toBuilder = true)
@EqualsAndHashCode(exclude = {
    "post" ,"address", "age"
})
public class Member {
    private String name;
    private String age;
    private String post;
    private String address;
}