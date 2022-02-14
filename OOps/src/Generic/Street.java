package Generic;

import java.util.Objects;

public class Street {
	
	private String Boardwalk;
	 public Street(String boardwalk, Integer num, Integer color)
	 {
		super();
		Boardwalk = boardwalk;
		this.num = num;
		this.color = color;
	}
	public Street() 
	{
		super();
	}
	@Override
	public int hashCode() 
	{
		return Objects.hash(Boardwalk, color, num);
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Street other = (Street) obj;
		return Objects.equals(Boardwalk, other.Boardwalk) && Objects.equals(color, other.color)
				&& Objects.equals(num, other.num);
	}
	@Override
	public String toString()
	{
		return "Street [Boardwalk=" + Boardwalk + ", num=" + num + ", color=" + color + "]";
	}
	private Integer num,color;
	public String getBoardwalk()
	{
		return Boardwalk;
	}
	public void setBoardwalk(String boardwalk) 
	{
		Boardwalk = boardwalk;
	}
	public Integer getNum()
	{
		return num;
	}
	public void setNum(Integer num)
	{
		this.num = num;
	}
	public Integer getColor()
	{
		return color;
	}
	public void setColor(Integer color)
	{
		this.color = color;
	}
}
