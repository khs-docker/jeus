// Arithmetic.cpp : Implementation of CArithmetic
#include "stdafx.h"
#include "Math.h"
#include "Arithmetic.h"

/////////////////////////////////////////////////////////////////////////////
// CArithmetic


STDMETHODIMP CArithmetic::Sum(int x, int y, int *sum)
{
	// TODO: Add your implementation code here
	*sum = x + y;
	return S_OK;
}
