package co.adeshina.rcopy.internal.dto;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Contents of a file along with associated metadata. For internal use only.
 */
public class FileContent {

    private final FileType type;
    private final byte[] bytes;
    private Charset charset = StandardCharsets.UTF_8;

    public FileContent(FileType type, byte[] bytes, Charset charset) {
        this.type = type;
        this.bytes = bytes;
        this.charset = charset != null ? charset : this.charset;
    }

    public Charset getCharset() {
        return charset;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public FileType getType() {
        return type;
    }
}
