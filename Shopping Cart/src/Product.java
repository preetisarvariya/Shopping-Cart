
/**
 * @author Preeti
 *
 */
public class Product {
	 	private Integer pid;
	    private String name;
	    private Double price;
	    private Integer stock;

	    /**
	     * @param pid
	     * @param name
	     * @param price
	     * @param stock
	     */
	    public Product(Integer pid,String name,Double price,Integer stock){
	    	this.pid=pid;
	    	this.name=name;
	    	this.price=price;
	    	this.stock=stock;
	    }

		/**
		 * @return the pid
		 */
		public Integer getPid() {
			return pid;
		}

		/**
		 * @param pid the pid to set
		 */
		public void setPid(Integer pid) {
			this.pid = pid;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the price
		 */
		public Double getPrice() {
			return price;
		}

		/**
		 * @param price the price to set
		 */
		public void setPrice(Double price) {
			this.price = price;
		}

		/**
		 * @return the stock
		 */
		public Integer getStock() {
			return stock;
		}

		/**
		 * @param stock the stock to set
		 */
		public void setStock(Integer stock) {
			this.stock = stock;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((pid == null) ? 0 : pid.hashCode());
			result = prime * result + ((price == null) ? 0 : price.hashCode());
			result = prime * result + ((stock == null) ? 0 : stock.hashCode());
			return result;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (pid == null) {
				if (other.pid != null)
					return false;
			} else if (!pid.equals(other.pid))
				return false;
			if (price == null) {
				if (other.price != null)
					return false;
			} else if (!price.equals(other.price))
				return false;
			if (stock == null) {
				if (other.stock != null)
					return false;
			} else if (!stock.equals(other.stock))
				return false;
			return true;
		}
}
