package com.github.loki.afro.metallum.example;

import com.github.loki.afro.metallum.MetallumException;
import com.github.loki.afro.metallum.search.query.MemberSearchQuery;
import com.github.loki.afro.metallum.search.service.MemberSearchService;
import org.junit.Assert;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.List;

public class MemberSearchExampleTest {

    @Ignore
    public void test() throws MetallumException {

        List<String> stringList = new ArrayList<>();
        stringList.add("Kerry King");
        stringList.add("");
        stringList.add("Fenriz");
        stringList.add("Bruce Dickinson");
        stringList.add("Mick Kenney");
        stringList.add("Joel Lindholm");
        stringList.add("Varg Vikernes");
        for (String memberName : stringList) {
            // System.out.println("searching with: " + memberName);
            MemberSearchQuery query = new MemberSearchQuery();
            MemberSearchService service = new MemberSearchService();
            query.setMemberName(memberName);
            service.performSearch(query);
            Assert.assertFalse(service.getResultAsList().isEmpty());
        }

    }
}
