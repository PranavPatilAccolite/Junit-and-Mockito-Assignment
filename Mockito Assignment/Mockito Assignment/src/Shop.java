public class Shop {
	
	private boolean ShopStatus;
	
	private void setShopStatus(boolean status)
	{
		this.ShopStatus = status;
	}
	
	private boolean getShopStatus()
	{
		return this.ShopStatus;
	}
	
	public boolean OpenShop(TimeHelper timeHelper, Customer customer) {
		if(customer.isRequest() == true)
		{
			setShopStatus(true);
			return getShopStatus();
		}
		else if(timeHelper.TimeHelper() == "Night") {
			setShopStatus(false);
			return getShopStatus();
		}
		setShopStatus(true);
		return getShopStatus();
	}
}