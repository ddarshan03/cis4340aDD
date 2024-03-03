static int countOneBits( long value ) {
  int bits = 0;
  while (value != 0) {
    bits += value & 1L;
    value >>>= 1;
  }
  return bits;
}