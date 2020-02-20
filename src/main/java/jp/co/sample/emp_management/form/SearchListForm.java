package jp.co.sample.emp_management.form;

public class SearchListForm {

	String findName;

	public String getFindName() {
		return findName;
	}

	public void setFindName(String findName) {
		this.findName = findName;
	}

	@Override
	public String toString() {
		return "SearchListForm [findName=" + findName + "]";
	}

}
