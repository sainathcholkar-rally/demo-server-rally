import { BenefitApiInterface } from './api';
import { UserRegistrationRequest } from './api';
const userBenefitsResponse = require("./userBenefitsResponse.json'")
const ccfBenefitModel = require("./ccfBenefitModel.json'")

/**
 * BenefitApiMock - Mock up implementation
 * @export
 * @class BenefitApiMock
 */
export class BenefitApiMock implements BenefitApiInterface {
    /**
     * 
     * @summary Get all benefits for a user
     * @param {string} rallyId 
     * @memberof BenefitApi
     */
    public getAllBenefits(rallyId: string, options?: any) {
        return userBenefitsResponse;
    }

    /**
     * 
     * @summary Get ccf benefits for a user
     * @param {string} rallyId 
     * @memberof BenefitApi
     */
    public getCcfenefits(rallyId: string, options?: any) {
        return ccfBenefitModel;
    }

    /**
     * 
     * @summary Register user for a medical plan
     * @param {string} rallyId 
     * @param {UserRegistrationRequest} body JSON body describing benefit
     * @memberof BenefitApi
     */
    public invokePlanPickup(rallyId: string, body: UserRegistrationRequest, options?: any) {
        return "";
    }

}