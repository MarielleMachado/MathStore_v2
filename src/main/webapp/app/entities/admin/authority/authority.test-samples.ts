import { IAuthority, NewAuthority } from './authority.model';

export const sampleWithRequiredData: IAuthority = {
  name: '800175b1-ab67-43ff-b99c-2962409590e9',
};

export const sampleWithPartialData: IAuthority = {
  name: '59f3d21e-a04c-4abf-87b7-a92f88c19ee0',
};

export const sampleWithFullData: IAuthority = {
  name: '2e17c429-53b6-467c-b26c-157b269f55df',
};

export const sampleWithNewData: NewAuthority = {
  name: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
