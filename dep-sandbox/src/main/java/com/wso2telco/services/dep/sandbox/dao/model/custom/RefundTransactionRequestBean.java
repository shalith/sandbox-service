/*******************************************************************************
 * Copyright  (c) 2015-2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * 
 * WSO2.Telco Inc. licences this file to you under  the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.services.dep.sandbox.dao.model.custom;


public class RefundTransactionRequestBean {

	private RefundTransaction refundTransaction;

	public RefundTransaction getRefundTransaction() {
		return refundTransaction;
	}

	public void setRefundTransaction(
			RefundTransaction refundTransaction) {
		this.refundTransaction = refundTransaction;
	}

	public static class RefundTransaction {

		private String clientCorrelator;

		private String endUserId;
		
		private String originalReferenceCode;
		
		private String originalServerReferenceCode;

		private PaymentAmount paymentAmount;

		private String referenceCode;

		public String getClientCorrelator() {
			return clientCorrelator;
		}

		public void setClientCorrelator(String clientCorrelator) {
			this.clientCorrelator = clientCorrelator;
		}

		public String getEndUserId() {
			return endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getOriginalReferenceCode() {
			return originalReferenceCode;
		}

		public void setOriginalReferenceCode(String originalReferenceCode) {
			this.originalReferenceCode = originalReferenceCode;
		}

		public String getOriginalServerReferenceCode() {
			return originalServerReferenceCode;
		}

		public void setOriginalServerReferenceCode(String originalServerReferenceCode) {
			this.originalServerReferenceCode = originalServerReferenceCode;
		}

		public PaymentAmount getPaymentAmount() {
			return paymentAmount;
		}

		public void setPaymentAmount(PaymentAmount paymentAmount) {
			this.paymentAmount = paymentAmount;
		}

		public String getReferenceCode() {
			return referenceCode;
		}

		public void setReferenceCode(String referenceCode) {
			this.referenceCode = referenceCode;
		}

		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Client Correlator : " + getClientCorrelator());
			builder.append("EndUserId : " + getEndUserId());
			builder.append("Reference Code : " + getReferenceCode());

			if (getPaymentAmount() != null) {
				builder.append(" " + getPaymentAmount().toString());
			}

			return builder.toString();
		}
	}
}
