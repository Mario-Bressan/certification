package com.bressan.stringbuilder.imutable;

public class ImmutableSwan {
    private StringBuilder builder;

    public ImmutableSwan(StringBuilder sb) {
        builder = sb;
    }

    public StringBuilder getBuilder() {
        //return builder;
       return new StringBuilder(builder);
    }
}
