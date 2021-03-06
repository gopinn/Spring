package us.gopinath;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape /*implements ApplicationContextAware, BeanNameAware, InitializingBean*/{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Drawing a Triangle");
		System.out.println("point A = ("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("point B = ("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("point C = ("+getPointC().getX()+","+getPointC().getY()+")");
	}

	/*
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context = context;
	}

	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("bean name is: "+beanName);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean init method called for triangle");
	}
	*/
	
	public void myInit() {
		System.out.println("myInit method called for triangle");
	}
	
	public void cleanUp() {
		System.out.println("cleanUp method called for triangle");
	}
}
