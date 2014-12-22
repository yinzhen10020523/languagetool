/* LanguageTool, a natural language style checker
 * Copyright (C) 2014 Daniel Naber (http://www.danielnaber.de)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301
 * USA
 */
package org.languagetool.tagging;

/**
 * Result of {@link org.languagetool.tagging.WordTagger}.
 * @since 2.8
 */
public class TaggedWord {

  private final String lemma;
  private final String posTag;

  public TaggedWord(String lemma, String posTag) {
    this.lemma = lemma;
    this.posTag = posTag;
  }

  public String getLemma() {
    return lemma;
  }

  public String getPosTag() {
    return posTag;
  }

  @Override
  public String toString() {
    return lemma + "/" + posTag;
  }
}
