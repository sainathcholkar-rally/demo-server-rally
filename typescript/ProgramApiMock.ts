import { ProgramApiInterface } from './api';
const programs = require("./programs.json'")

/**
 * ProgramApiMock - Mock up implementation
 * @export
 * @class ProgramApiMock
 */
export class ProgramApiMock implements ProgramApiInterface {
    /**
     * 
     * @summary Get all programs for a user
     * @param {string} rallyId 
     * @memberof ProgramApi
     */
    public getAllPrograms(rallyId: string, options?: any) {
        return programs;
    }
}