/**
 * This class is a junit tester
 * tests all the methods we have
 * in Linked List class
 * @author Nada Al-Thawr 
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
	// create a new empty test list
	LinkedList<String> testList = new LinkedList<String>();

	@Before
	// add to the list
	public void createTestList() {
		testList.insertFirst("S");
		testList.insertFirst("E");
		testList.insertFirst("O");
		testList.insertFirst("T");
		testList.insertFirst("A");
		testList.insertFirst("T");
		testList.insertFirst("O");
		testList.insertFirst("P");
	}

	@Test
	public void testInsertFirst() {
		// test insert first
		testList.insertFirst("O");

		String message = "Testing insert first, expecting OPOTATO.";
		assertEquals(message, "O->P->O->T->A->T->O->E->S", testList.toString());
	}

	@Test
	public void testGetFirst() {
		// test insert get first
		String message = "Testing get first, expecting P";
		assertEquals(message, "P", testList.getFirst().toString());
	}

	@Test
	public void testGetFirstNode() {
		// test get first node
		String message = "Testing get first node, expecting P";
		assertEquals(message, "P", testList.getFirstNode().toString());

	}

	@Test
	public void testGetLast() {
		// test get last
		String message = "Testing get last, expecting S.";
		assertEquals(message, "S", testList.getLast().toString());

	}

	@Test
	public void testGetLastNode() {
		// test get last node
		String message = "Testing get last node, expecting S.";
		assertEquals(message, "S", testList.getLastNode().toString());
	}

	@Test
	public void testInsertAfter() {
		// test insert after
		String message = "Testing insert after, calling it one time.";
		testList.insertAfter(testList.getFirstNode().getNext(), "Y");
		assertEquals(message, "P->O->Y->T->A->T->O->E->S", testList.toString());

	}

	@Test
	public void testInsertLast() {
		// test insert last
		String message = "Testing insert last, calling it one time.";
		testList.insertLast("S");
		assertEquals(message, "P->O->T->A->T->O->E->S->S", testList.toString());

	}

	@Test
	public void testDeleteFirst() {
		// test delete first
		testList.deleteFirst();
		String message = "Testing delete first, calling it one time.";
		assertEquals(message, "O->T->A->T->O->E->S", testList.toString());
	}

	@Test
	public void testDeleteNext() {
		// test delete next
		testList.deleteNext(testList.getFirstNode());
		String message = "Testing delete next, calling it one time.";
		assertEquals(message, "P->T->A->T->O->E->S", testList.toString());
	}

	@Test
	public void testtDeleteLast() {
		// test delete last
		testList.deleteLast();
		String message = "Testing delete last, calling it one time.";
		assertEquals(message, "P->O->T->A->T->O->E", testList.toString());
	}

	@Test
	public void testSize() {
		// test the size method
		String message = "Testing size, expecting the list size.";
		assertEquals(message, 8, testList.size());
	}

	@Test
	public void myBeautifulTest() {
		// create a new empty list
		LinkedList<String> beautifulList = new LinkedList<String>();
		// then add the characters as the instructions ask
		// insert the first letters
		beautifulList.insertFirst("a");
		beautifulList.insertFirst("v");
		beautifulList.insertFirst("a");
		beautifulList.insertFirst("l");
		beautifulList.insertFirst("o");
		beautifulList.insertFirst("i");
		// insert after the node after the head
		beautifulList.insertAfter(beautifulList.getFirstNode().getNext(), "j");
		beautifulList.insertAfter(beautifulList.getFirstNode().getNext(), "e");
		beautifulList.insertAfter(beautifulList.getFirstNode().getNext(), "v");
		// insert after the head
		beautifulList.insertAfter(beautifulList.getFirstNode(), "l");
		// delete the node after the node after the node after the node after
		// the first one
		beautifulList.deleteNext(beautifulList.getFirstNode().getNext()
				.getNext().getNext().getNext());
		// testing the list
		String message = "Testing our beautiful test, expecting ilovelava.";
		assertEquals(message, "i->l->o->v->e->l->a->v->a",
				beautifulList.toString());

	}

}
