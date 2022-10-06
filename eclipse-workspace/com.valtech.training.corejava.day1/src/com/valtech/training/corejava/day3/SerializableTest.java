package com.valtech.training.corejava.day3;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class SerializableTest {

	@Test
	public void test()throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("objects.txt")));
		Point p = new Point(2,3);
		Point p1 = new Point3D(1,2,3);
		oos.writeObject(p);
		ooos.writeObject(p1);
		oos.flush();
		oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("objects.txt")));
		Point r = (Point)ois.readObject();
		Point3D r1 = (Point)ois.readObject();
		assertEquals(p, r);
		assertEquals(p1, r1);
		assertEquals(p.hashCode(), r.hashCode());
		assertFalse(p == r);
	}

}
