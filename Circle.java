package GameEx_Final;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
/**
 * This class represents a 2D circle in the plane. Please make sure you update it
 * according to the GeoShape interface.
 * Ex4: you should update this class!
 * @author elay levi
 *
 */
public class Circle implements GeoShape{

	private int x=0, y=0;
	int radius=0;
	private int dx=0, dy=0;
	private int red =0, green=0, blue=0;
	public Circle(int x,int y,int radius,int red, int green, int blue){
		this.x=x;
		this.y=y;
		this.radius=radius;
		this.red=red;
		this.green=green;
		this.blue=blue;
	}

	/*
	 * Please, do not change this function!
	 *
	 */
	@Override
	public void draw(Graphics g, Component c) {
		g.setColor(new Color( getRed(),getGreen(),getBlue()));
		g.fillOval(getX(), getY(), getRadius(), getRadius());
		g.setColor(new Color(0,0,0));
		g.drawOval(getX(), getY(), getRadius(), getRadius());

	}
	public void setRadius(int r) {
		radius=r;
	}
	public int getRadius() {
		// TODO Auto-generated method stub
		return radius;
	}

	@Override
	public void translateX() {
		// TODO Auto-generated method stub
		x+=dx;
	}
	@Override
	public void translateY() {
		// TODO Auto-generated method stub
		y+=dy;
	}

	@Override
	public void setColor(int r, int g, int b) {
		// TODO Auto-generated method stub
		red=r;
		green=g;
		blue=b;
	}

	@Override
	public boolean intersects(GeoShape g) {
		// TODO Auto-generated method stub
			if(g instanceof Circle) {
				if(((Circle) g).radius+radius < distance(g.getX(),g.getY()))
					return false;
				return true;
			}
			if(g instanceof Rectangle) {

				int Rx = g.getX()+((Rectangle) g).getWidth();

				int Lx = g.getX();

				int ty = g.getY();

				int by = g.getY() - ((Rectangle)g).getHeight();

				if(x<=Rx && x>=Lx && y>=by && y<=ty)
					return true;
				if(x<=Rx && x>=Lx)
					return Math.min(lop(Lx,ty,Rx,ty,x,y),lop(Lx,by,Rx,by,x,y))<=radius;
				if(y>=by && y<=ty)
					return Math.min(lop(Rx,ty,Rx,by,x,y), lop(Lx,ty,Lx,by,x,y))<=radius;
				return min(distance(Lx,ty),distance(Rx,ty),distance(Rx,by),distance(Lx,by))<=radius;
			}
			return false;
		}
		public static double lop(int x1,int y1,int x2,int y2,int x3,int y3) {
			if(x1==x2)
				return Math.abs(x1-x3);
			if(y1==y2)
				return Math.abs(y1-y3);
			else return -1;
		}
		public double min(double n1,double n2,double n3,double n4) {

		return Math.min(Math.min(n1,n2),Math.min(n3,n4));
		}

		public double distance(double x, double y) {
			return Math.sqrt(pow(this.x-x)+pow(this.y-y));
		}
		public double pow(double n) {
		return n*n;
	}



		@Override
	public int getDx() {
		// TODO Auto-generated method stub
		return dx;
	}

	@Override
	public void setDx(int dx) {
		// TODO Auto-generated method stub
		this.dx=dx;
	}

	@Override
	public int getDy() {
		// TODO Auto-generated method stub
		return dy;
	}

	@Override
	public void setDy(int dy) {
		// TODO Auto-generated method stub
		this.dy=dy;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		this.x=x;

	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return this.y;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		this.y=y;
	}

	@Override
	public int getRed() {
		// TODO Auto-generated method stub
		return red;
	}

	@Override
	public int getGreen() {
		// TODO Auto-generated method stub
		return green;
	}

	@Override
	public int getBlue() {
		// TODO Auto-generated method stub
		return blue;
	}

}
