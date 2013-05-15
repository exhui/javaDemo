package com.exhui.axis.service;

import java.util.HashMap;
import java.util.Map;

import com.exhui.axis.vo.BookVO;
import com.exhui.axis.vo.PersonVO;

public class PersonInfoService {
	
	public PersonInfoService() {
	}

	public String getPersonInfo(PersonVO person) {
		String personinfo = "";
		personinfo = "Hello, " + person.getName()
				+ " ! This is you information\r\n";
		personinfo = personinfo + "Ages: " + person.getAge() + "\r\n";
		Map skill = person.getSkill();
		String strskill = "";
		strskill = strskill + skill.get("NAME") + " : you have "
				+ skill.get("YEAR") + " years experience!\r\n";
		personinfo = personinfo + strskill;
		personinfo = personinfo + "Book Name : "
				+ person.getMybook().getBookname() + "\r\n";
		personinfo = personinfo + "ISBN : " + person.getMybook().getIsbn()
				+ "\r\n";
		personinfo = personinfo + "You pay $" + person.getMybook().getPrice()
				+ " for this book.\r\n";
		personinfo = personinfo + "This book have "
				+ person.getMybook().getPages() + " pages.\r\n";
		return personinfo;
	}

	public BookVO setBookInfo(String bookname, Long isbn) {
		BookVO book = new BookVO();
		book.setBookname(bookname);
		book.setIsbn(isbn);
		book.setPages(new Integer(265));
		book.setPrice((float) 25.65);
		return book;
	}

	public PersonVO getPersonInfo() {
		PersonVO person = new PersonVO();
		person.setName("Aaron");
		person.setAge(26);
		Map skill = new HashMap();
		skill.put("NAME", "JAVA");
		skill.put("YEAR", "3");
		person.setSkill(skill);
		BookVO book = new BookVO();
		book.setBookname("<Thinking in Java>");
		book.setIsbn(new Long(456256821));
		book.setPages(new Integer(982));
		book.setPrice((float) 99.8);
		person.setMybook(book);
		return person;
	}
}
