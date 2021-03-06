/* Copyright (c) 2008-2012, Avian Contributors

   Permission to use, copy, modify, and/or distribute this software
   for any purpose with or without fee is hereby granted, provided
   that the above copyright notice and this permission notice appear
   in all copies.

   There is NO WARRANTY for this software.  See license.txt for
   details. */

package java.util.zip;

public abstract class ZipEntry {
  public abstract String getName();
  public abstract int getCompressedSize();
  public abstract int getSize();

  public boolean isDirectory() {
    return getName().endsWith("/");
  }
}
