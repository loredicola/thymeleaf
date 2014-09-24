/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.engine.markup.handler;

/**
 *
 * @author Daniel Fern&aacute;ndez
 * @since 3.0.0
 * 
 */
public interface INonSelectedSelectorEventHandler {


    /*
     * ------------------------
     * XML Declaration events
     * ------------------------
     */

    public void onNonSelectedXmlDeclaration(
            final String xmlDeclaration,
            final String version, final String encoding, final boolean standalone,
            final String documentName, final int line, final int col,
            final IMarkupHandler handler);


    /*
     * ---------------------
     * DOCTYPE Clause events
     * ---------------------
     */

    public void onNonSelectedDocTypeClause(
            final String docTypeClause,
            final String rootElementName, final String publicId, final String systemId,
            final String documentName, final int line, final int col,
            final IMarkupHandler handler);


    /*
     * --------------------
     * CDATA Section events
     * --------------------
     */

    public void onNonSelectedCDATASection(
            final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col,
            final IMarkupHandler handler);


    /*
     * -----------
     * Text events
     * -----------
     */

    public void onNonSelectedText(
            final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col,
            final IMarkupHandler handler);


    /*
     * --------------
     * Comment events
     * --------------
     */

    public void onNonSelectedComment(
            final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col,
            final IMarkupHandler handler);


    /*
     * ----------------
     * Element handling
     * ----------------
     */

    public void onNonSelectedAttribute(
            final char[] buffer,
            final int nameOffset, final int nameLen,
            final int nameLine, final int nameCol,
            final int operatorOffset, final int operatorLen,
            final int operatorLine, final int operatorCol,
            final int valueContentOffset, final int valueContentLen,
            final int valueOuterOffset, final int valueOuterLen,
            final int valueLine, final int valueCol, final String documentName,
            final IMarkupHandler handler);

    public void onNonSelectedStandaloneElementStart(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final boolean minimized, final String documentName, final int line, final int col,
            final IMarkupHandler handler);

    public void onNonSelectedStandaloneElementEnd(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final boolean minimized, final String documentName, final int line, final int col,
            final IMarkupHandler handler);

    public void onNonSelectedOpenElementStart(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col,
            final IMarkupHandler handler);

    public void onNonSelectedOpenElementEnd(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col,
            final IMarkupHandler handler);

    public void onNonSelectedCloseElementStart(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col,
            final IMarkupHandler handler);

    public void onNonSelectedCloseElementEnd(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col,
            final IMarkupHandler handler);

    public void onNonSelectedAutoCloseElementStart(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col,
            final IMarkupHandler handler);

    public void onNonSelectedAutoCloseElementEnd(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col,
            final IMarkupHandler handler);

    public void onNonSelectedUnmatchedCloseElementStart(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col,
            final IMarkupHandler handler);

    public void onNonSelectedUnmatchedCloseElementEnd(
            final String normalizedName, final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col,
            final IMarkupHandler handler);

    public void onNonSelectedElementInnerWhiteSpace(
            final char[] buffer, final int offset, final int len,
            final String documentName, final int line, final int col,
            final IMarkupHandler handler);


    /*
     * -------------------------------
     * Processing Instruction handling
     * -------------------------------
     */

    public void onNonSelectedProcessingInstruction(
            final String processingInstruction,
            final String target, final String content,
            final String documentName, final int line, final int col,
            final IMarkupHandler handler);


}
