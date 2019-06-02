// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CustomKernelCreator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CustomKernelCreator(Pointer p) { super(p); }


  // Given a NodeDef 'node_def' and the function library runtime 'flr',
  // validate if the class supports creating such a kernel.
  public native @Cast("bool") boolean CanCreateKernel(@Const @ByRef FunctionLibraryRuntime flr,
                                 @Const @ByRef NodeDef node_def);

  // Given a supported NodeDef, returns a kernel that computes the node.
  public native @ByVal Status CreateKernel(FunctionLibraryRuntime flr, @Const @ByRef NodeDef ndef,
                                @UniquePtr OpKernel kernel);
}