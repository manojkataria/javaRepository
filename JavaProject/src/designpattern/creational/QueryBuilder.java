package designpattern.creational;

public class QueryBuilder {

	private String  posWhereClause;
	private String  checkWhereClause;
	
    public static class Builder {

    	private String  posWhereClause;
    	private String  checkWhereClause;

        public Builder posWhereClause(String posWhereClause) {
            this.posWhereClause = posWhereClause;
            return this;
        }

        public Builder checkWhereClause(String checkWhereClause) {
            this.checkWhereClause = checkWhereClause;

            return this;
        }


        public QueryBuilder build() {
            return new QueryBuilder(this);
        }

    }

    private QueryBuilder(Builder builder) {
    	this.posWhereClause = builder.posWhereClause;
    	this.checkWhereClause = builder.checkWhereClause;
    }

    public String buildQuery() {
    	
    	return posWhereClause + checkWhereClause;
    			/*this.posWhereClause
          		 == null || posWhereClause.isEmpty()
        	    ? Optional.empty()
        	    : Optional.of(posWhereClause + checkWhereClause);*/
    }
    	    
	@Override
	public String toString() {
		return "QueryBuilder [posWhereClause=" + posWhereClause + ", checkWhereClause=" + checkWhereClause + "]";
	}

}