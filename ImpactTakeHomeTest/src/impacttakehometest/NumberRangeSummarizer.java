/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impacttakehometest;

import java.util.Collection;

/**
 *
 * @author muttalibmoos
 */
public interface NumberRangeSummarizer {
    
//collect the input
    Collection<Integer> collect(String input);

    //get the summarized string
    String summarizeCollection(Collection<Integer> input);
    
}
