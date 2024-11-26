package kr.co.abacus.javamain;

 

public class LombokEquals {
    public static void main(String[] args) {
        Member member1 = Member.builder().name("홍길동").age("20").build();
        Member member2 = Member.builder().name("홍길동1").age("201").build();

        System.out.println(member1.equals(member2));
    }
}
