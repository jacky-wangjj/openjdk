/*
 * Copyright 2009 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */
package sun.nio.ch;

import com.sun.nio.sctp.SctpSocketOption;

public class SctpStdSocketOption<T>
    implements SctpSocketOption<T>
{
    /* for native mapping of int options */
    public static final int SCTP_DISABLE_FRAGMENTS = 1;
    public static final int SCTP_EXPLICIT_COMPLETE = 2;
    public static final int SCTP_FRAGMENT_INTERLEAVE = 3;
    public static final int SCTP_NODELAY = 4;
    public static final int SO_SNDBUF = 5;
    public static final int SO_RCVBUF = 6;
    public static final int SO_LINGER = 7;

    private final String name;
    private final Class<T> type;

    /* for native mapping of int options */
    private int constValue;

    public SctpStdSocketOption(String name, Class<T> type) {
        this.name = name;
        this.type = type;
    }

    public SctpStdSocketOption(String name, Class<T> type, int constValue) {
        this.name = name;
        this.type = type;
        this.constValue = constValue;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Class<T> type() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }

    int constValue() {
        return constValue;
    }
}
