/**
 * @author HarshMehra
 * @version 2.0
 * @since 2025
 */

package javaDocsAndAnnotations;

/**
 * @author HarshMehra
 * <p>
 * Class for Library Book
 **/

public class Book {

    /**
     * @value 10 default value
     */
    static int val = 10;

    /**
     * @param s Book name
     */

    public Book(String s) {

    }

    /**
     * Issue a book to the student
     *
     * @param rollNo roll number of a student
     * @throws Exception if book is not available throw an error
     */

    public void issue(int rollNo) throws Exception {
    }

    /**
     * Check if book is available
     *
     * @param str Book name
     * @return if book is available returns true else false
     */
    public boolean available(String str) {
        return true;
    }

    public String getName(int id) {
        return "";
    }
}
