package org.lxh.demo16.reflectannotation ;
public class SimpleBeanTwo{
	@SuppressWarnings("unchecked") 
	@Deprecated
	@Override
	@MyDefaultAnnotationReflect(key="MLDN",value="www.mldnjava.cn")
	public String toString(){
		return "Hello LiXingHua!!!" ;
	}
};