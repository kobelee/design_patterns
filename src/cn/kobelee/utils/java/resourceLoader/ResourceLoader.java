package cn.kobelee.utils.java.resourceLoader;

/**
 * Resource loader interface, providing a interface to load resources 
 * like *.properties, *.xml, etc. 
 * @author Kobe Lee
 * @created_date 2015-06-17
 *
 */
public interface ResourceLoader {
	/**
	 * The ResourceTypes, generally, it defines the file type of the resource data. 
	 * such as "*.xml" or "*.properties"
	 * @author Kobe Lee
	 *
	 */
	public class ResourceType{
		public static final String XML = ".xml";
		public static final String PROPERTIES = ".properties";
	}
	
}
