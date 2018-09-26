package net.moonj.admgc.vo;

import java.util.List;
import java.util.Map;

public class GeneConfig {

	private String tableName;
	
	/**
	 * 
	 */
	private List<Function> functions;
	
	public static enum Function{
		insert,delete,update
	}
	
	private List<String> queryColumns;
	
	private Map<String,String> queryColumnsNamingMap;
	
	private Map<String,ShowType> insertColumnShowType;
	
	private Map<String,ShowType> updateColumnShowType;
	
	private String primaryKey;
	
	private Map<String,String> aliasMap;
	
	public static enum ShowType{
		shortText,longText,datetime
	}
	
	private Map<String,Map<String,Object>> columnMsg;
	
	public Map<String, Map<String, Object>> getColumnMsg() {
		return columnMsg;
	}

	public void setColumnMsg(Map<String, Map<String, Object>> columnMsg) {
		this.columnMsg = columnMsg;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<Function> getFunctions() {
		return functions;
	}

	public void setFunctions(List<Function> functions) {
		this.functions = functions;
	}

	public List<String> getQueryColumns() {
		return queryColumns;
	}

	public void setQueryColumns(List<String> queryColumns) {
		this.queryColumns = queryColumns;
	}

	public Map<String, ShowType> getInsertColumnShowType() {
		return insertColumnShowType;
	}

	public void setInsertColumnShowType(Map<String, ShowType> columnShowType) {
		this.insertColumnShowType = columnShowType;
	}

	public Map<String, ShowType> getUpdateColumnShowType() {
		return updateColumnShowType;
	}

	public void setUpdateColumnShowType(Map<String, ShowType> updateColumnShowType) {
		this.updateColumnShowType = updateColumnShowType;
	}

	public String getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public Map<String, String> getAliasMap() {
		return aliasMap;
	}

	public void setAliasMap(Map<String, String> aliasMap) {
		this.aliasMap = aliasMap;
	}

	public Map<String, String> getQueryColumnsNamingMap() {
		return queryColumnsNamingMap;
	}

	public void setQueryColumnsNamingMap(Map<String, String> queryColumnsNamingMap) {
		this.queryColumnsNamingMap = queryColumnsNamingMap;
	}


	
	
}
