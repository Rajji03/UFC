package com.backend.ufc.concurrent;

import java.util.*;

public class ExtraCotent {
    public static void main(String[] args) {
//        getRecipients("ag.rajat112@gmail.com,rajatagrawal2702@gmail.com");
        List<String> arl= getRecipients("jsdfjdslfj");
        arl.stream().forEach(System.out::println);
    }
//    public static String getAttributeValue(OrderValue contextStore, String attribute) {
//
//        LOGGER.info(Logger.EVENT_SUCCESS,"--- getAttributeValue triggered --- \ncontextStore:" + contextStore + "\nattribute:" + attribute);
//
//        String attributeValue = null;
//        Optional<CharacteristicValue> optional = contextStore.getDescribedBy().getItem()
//                .stream()
//                .filter(characteristicValue -> attribute.equals(characteristicValue.getName()))
//                .findAny();
//
//        if (optional.isPresent()) {
//            attributeValue = optional.get().getValue();
//        }
//        return attributeValue;
//    }
//    public static String convert2UTC(Date date) {
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
//        return (sdf.format(date));
//    }

    private static List<String> getRecipients(String commaSeparatedEmailIds) {
        return Optional.ofNullable(commaSeparatedEmailIds)
                .map(emails -> emails.trim().split(","))
                .map(Arrays::asList)
                .orElse(Collections.emptyList());
    }
}
