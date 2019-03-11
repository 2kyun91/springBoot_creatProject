package com.example.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * Lombok 라이브러리를 사용하면 Java 코드를 컴파일할 때 자동으로 추가 메소드를 만들어서 컴파일해 주는 라이브러리이다.
 * @ Getter, Setter, ToString 어노테이션을 사용하면 컴파일 시 getter/setter/toString() 메소드를 자동으로 작성해주어
 * 코드가 간결해지고 개발이 편리해진다.
 * 
 * @Getter
 * @Setter
 * @ToString
 * */

/*
 * @Data 어노테이션을 사용하면 
 * getter / setter / equals() / hashCode() / toString() / 파라미터가 없는 기본 생성자를 자동으로 만들어 준다.
 * @Data == @Getter + @Setter + @ToString + @EqualsAndHashCode + @RequireArgsConstructor
 * @ToString에 exclude 속성을 이용해서 원하지 않는 속성을 출력하지 않도록 제어할 수 있다.
 * @Data 어노테이션을 잘못 사용하게 되는경우 무한루프에 빠지는 에러가 발생할 수 있으므로 주의해야한다.
 * 따라서 되도록 각각의 어노테이션을 사용해 코드를 작성하는게 안전하다.
 * 
 *  @Data
 *  @ToString(exclude = {"value3"})
 * */
@Getter
@Setter
@ToString
public class SampleDao {
	public String value1;
	public String value2;
	public String value3;
}
