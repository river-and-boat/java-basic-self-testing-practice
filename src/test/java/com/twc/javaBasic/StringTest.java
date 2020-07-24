package com.twc.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringTest {
    //Hint: String https://beginnersbook.com/2013/12/java-strings/
    @SuppressWarnings({"StringEquality", "ConstantConditions"})
    @Test
    void should_be_immutable() {
        String originalString = "The original string";
        String modifiedString = originalString.replace("original", "new");

        // TODO:
        //  Please modify the following line to pass the test. It is really easy to pass
        //  the test. But you have to tell why.
        // ==符号比较的是字符串在堆上的引用是否相等
        // 此处originalString.replace的返回结果，产生了一个新的字符串对象，堆中存储值的位置自然也发生了改变
        // 因此==比较结果为false
        // 如需比较值，应调用Object的equal方法，String类对其进行了重写
        // 虽然这里它们的值也不想等- -
        // <--start
        final boolean areSame = false;
        // --end-->

        assertEquals("The new string", modifiedString);
        assertEquals(areSame, originalString == modifiedString);
    }

    @SuppressWarnings({"StringEquality", "ConstantConditions"})
    @Test
    void all_modification_method_will_create_new_string() {
        String originalString = "The string with tailing space.     ";
        String modifiedString = originalString.trim();

        // TODO:
        //  Please modify the following line to pass the test. It is really easy to pass
        //  the test. But you have to tell why.
        // 理由同上，内存中对字符串的操作，将会返回一个新的字符串，trim()返回值的堆引用不同
        // <--start
        final boolean areSame = false;
        // --end-->

        assertEquals("The string with tailing space.", modifiedString);
        assertEquals(areSame, originalString == modifiedString);
    }

    @SuppressWarnings("StringEquality")
    @Test
    void will_create_new_string_when_concat() {
        String originalString = "Part one. ";
        String copyOfOriginalString = originalString;
        originalString += "Part two.";

        // TODO:
        //  Please modify the following line to pass the test. It is really easy to pass
        //  the test. But you have to tell why.
        // 一开始的前两步，两个值的引用一样
        // 在第三步执行+=操作后，originalString会返回一个新的字符串引用，因此导致==比较为false
        // 因此从调试也可看出，priginalString最后的值为Part one. Part two. ; copyOfOriginalString依然为Part one.
        // <--start
        final boolean areSame = false;
        // --end-->

        assertEquals("Part one. Part two.", originalString);
        assertEquals(areSame, originalString == copyOfOriginalString);
    }


    @SuppressWarnings({"unused"})
    @Test
    void should_break_string_into_words() {
        final String sentence = "This is Mike";

        // TODO: Extract words in the sentence.
        // <--Start
        String[] words = sentence.split(" ");
        // --End-->

        assertArrayEquals(new String[] {"This", "is", "Mike"}, words);
    }

}
