package designpattern.creational;

public class TestStudent {

    public static void main(String[] args) {

        Student s = new Student.Builder()
			.name("test")
			.age(18)
			//.language(Arrays.asList("chinese","english"))
			.build();

		//Student{name='mkyong', age=18, language=[chinese, english]}
        //System.out.println(s);

		QueryBuilder qb = new QueryBuilder
				.Builder().posWhereClause(" WHERE v.posCode =: posCode")
				.checkWhereClause(" AND v.checkCode =: checkCode").build();
		
		
		System.out.println(qb.buildQuery());

	}

}